package ru.gsv.ai.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.builder.shared.*;
import com.google.gwt.dom.client.*;
import ru.gsv.ai.client.charts.*;

import static com.google.gwt.user.client.ui.RootPanel.get;

public class Origin implements EntryPoint {

  public void onModuleLoad()
  {
      DivBuilder divBuilder = ElementBuilderFactory.get().createDivBuilder();

      divBuilder.id("myId").title("This is a div");
      divBuilder.style().trustedBackgroundColor("red").endStyle();
      divBuilder.text("Hello World!").endDiv();
      Document.get().getBody().appendChild(divBuilder.finish());

      ButtonBuilder pushButtonBuilder = ElementBuilderFactory.get().createPushButtonBuilder();
      pushButtonBuilder.text("Button");
      pushButtonBuilder.endButton();
      Document.get().getBody().appendChild(pushButtonBuilder.finish());

      get().add(new ZoomableTimeSeriesChart().createChart());
      get().add(new BasicAreaChart().createChart());
  }
}
