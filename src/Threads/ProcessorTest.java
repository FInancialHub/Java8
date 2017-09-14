package Threads;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.SliderUI;

class Processor implements Callable<Map> {
	private final File file;

	public Processor(File file) {
		this.file = file;
	}

	@Override
	public Map call() throws Exception {

		Map readFile = readFile(file);
		//System.out.println(readFile);
		return readFile;
	}

	private Map readFile(File file2) {
		try (Stream<String> stream = Files.lines(Paths.get(file2.getAbsolutePath()))) {
			
			return stream.filter(line -> line.startsWith("JP"))
					.map(line -> line.split(","))
					.collect(Collectors.toMap(array -> array[2],array -> array[1],(oldvalue,newvalue) -> oldvalue ));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}

public class ProcessorTest {
	
	public static void main(String[] args) {
		
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		crawlDirectoryAndProcessFiles(new File("D://"), executor);
	}
	
	@SuppressWarnings("rawtypes")
	private static void crawlDirectoryAndProcessFiles(File directory,
			ExecutorService executor) {
		 List<Future<Map>> resultList = new ArrayList<>();
		for (File file : directory.listFiles()) {
			if (file.getName().startsWith("file")){
				Future<Map> result = executor.submit(new Processor(file));
				resultList.add(result);
			}
		}
		
		resultList.forEach(futrue -> {
			try {
				System.out.println(futrue.get());
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		//resultList.stream().forEachOrdered(System.out::println);
		executor.shutdown();
	}
}
