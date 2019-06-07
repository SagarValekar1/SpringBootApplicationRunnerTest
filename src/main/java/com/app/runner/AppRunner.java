package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements ApplicationRunner {
@Override
public void run(ApplicationArguments args) throws Exception {
	// Option args
	//read all keys
	Set<String> optionKeys=args.getOptionNames();
	System.out.println(optionKeys);
	List<String> list=args.getOptionValues("profile");
	
	
	//Non option
	List<String> nonop=args.getNonOptionArgs();
	String[] arr=args.getSourceArgs();
	System.out.println(Arrays.asList(arr));
	
}
}
