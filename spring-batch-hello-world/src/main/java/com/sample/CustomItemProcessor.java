package com.sample;

import org.springframework.batch.item.ItemProcessor;
import com.sample.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {

		System.out.println("Processing..." + item);
		return item;
	}
}