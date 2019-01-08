package com.fca.uconnect.test;

import javax.microedition.xlet.UnavailableContainerException;
import javax.microedition.xlet.Xlet;
import javax.microedition.xlet.XletContext;
import javax.microedition.xlet.XletStateChangeException;

import com.codename1.ui.Display;

public class HelloWorldXlet implements Xlet
{
  java.awt.Container xletContainer;

  /**
   * Signals the Xlet to initialize itself and enter the Paused state.
   * The Xlet shall initialize itself in preparation for providing service.
   * It should not hold shared resources but should be prepared to provide
   * service in a reasonable amount of time.
   *
   * @param context The XletContext of this Xlet.
   *
   * @see javax.microedition.xlet.Xlet#initXlet(javax.microedition.xlet.XletContext)
   */
  public void initXlet(XletContext context) throws XletStateChangeException
  {
    try
     {
       xletContainer = context.getContainer();
       Display.init(xletContainer);
     }
    catch (UnavailableContainerException e)
     {
       // TODO Auto-generated catch block
       e.printStackTrace();
     }
  }

  /**
   * Signals the Xlet to stop providing service and enter the Paused state.
   * In the Paused state the Xlet must stop providing service,
   * and might release all shared resources and become quiescent.
   * This method will only be called called when the Xlet is in the Active state.
   */
  public void pauseXlet()
  {
    // TODO Auto-generated method stub
  }

  /**
   * Signals the Xlet to start providing service and enter the Active state.
   * In the Active state the Xlet may hold shared resources.
   * The method will only be called when the Xlet is in the paused state.
   */
  public void startXlet() throws XletStateChangeException
  {
	  System.out.println("Hello World");
  }

  /**
   * Signals the Xlet to terminate and enter the Destroyed state.
   * In the destroyed state the Xlet must release all resources and save any
   * persistent state.
   * This method may be called from the Loaded, Paused or Active states.
   * <p>
   * Xlets should perform any operations required before being terminated,
   * such as releasing resources or saving preferences or state.
   * <p>
   * NOTE: The Xlet can request that it not enter the Destroyed state
   * by throwing an XletStateChangeException. This is only a valid response
   * if the unconditional flag is set to false. If it is true the Xlet is
   * assumed to be in the Destroyed state regardless of how this method terminates.
   * If it is not an unconditional request, the Xlet can signify
   * that it wishes to stay in its current state by throwing the Exception.
   * This request may be honored and the destroyXlet() method called again at a
   * later time.
   *
   * @param unconditional - If unconditional is true when this method is called,
   * requests by the Xlet to not enter the destroyed state will be ignored.
   */
  public void destroyXlet(boolean unconditional) throws XletStateChangeException
  {
    // TODO Auto-generated method stub
  }
}