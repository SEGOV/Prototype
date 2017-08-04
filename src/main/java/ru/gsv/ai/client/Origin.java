package ru.gsv.ai.client;

import com.google.gwt.core.client.EntryPoint;
import ru.gsv.ai.client.charts.*;

import static com.google.gwt.user.client.ui.RootPanel.get;

public class Origin implements EntryPoint {

  public void onModuleLoad()
  {
      new FunctionalChart().createFunctionalBodyElements();
      get().add(new ZoomableTimeSeriesChart().createChart());
      get().add(new BasicAreaChart().createChart());
  }
}
