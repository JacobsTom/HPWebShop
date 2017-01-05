package ui.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerFactory 
{
	private Map<String,RequestHandler> map;
	
	public HandlerFactory()
	{
		map = new HashMap<String,RequestHandler>();
		map.put("home", new HomepageHandler());
//		map.put("addMessage", new MessagepageHandler());
//		map.put("createMessage", new CreateMessageHandler(service));
//		map.put("showMessage", new ShowMessageHandler(service));
//		map.put("showMessageOverview", new ShowOverviewHandler(service));
//		map.put("slideShow", new SlideShowHandler(service));
//		map.put("deleteImage", new deleteMessageHandler(service));
//		map.put("changeVisibility", new visibilityHandler(service));
//		map.put("editMessage", new EditMessageHandler(service));
//		map.put("updateMessage", new UpdateMessageHandler(service));
	}
	
	public RequestHandler createHandler(String action)
	{
		RequestHandler handler = map.get(action);
		return handler;
	}
}
