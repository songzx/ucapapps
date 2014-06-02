package com.ucap.components.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

import com.sun.syndication.feed.atom.Content;
import com.sun.syndication.feed.atom.Entry;


public class MyAtomFeedView extends AbstractAtomFeedView {

	@Override
	protected List<Entry> buildFeedEntries(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setHeader("Content-Type", "text/html; charset=UTF-8");
		//System.out.println(model);
		List<Entry> entries = new ArrayList<>();
		Entry entry = new Entry();
		entry.setCreated(new Date());
		entry.setId(UUID.randomUUID().toString());
		entry.setTitle("标题");
		Content content = new Content();
		content.setValue("内容");
		entry.setContents(java.util.Arrays.asList(content));
		entries.add(entry);
		return entries;
	}


}
