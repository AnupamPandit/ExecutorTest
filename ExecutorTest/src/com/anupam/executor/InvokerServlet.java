package com.anupam.executor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvokerServlet
 */
public class InvokerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvokerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Anupam is here");
		ExecutorService executor = (ExecutorService )getServletContext().getAttribute("MY_EXECUTOR");
		executor.submit(new RunningThread());
		System.out.println("Main thread loop");
		for(int i = 0;i < 1000;i++){
			System.out.println("Parent Thread i--->"+i);
		}
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("Welcome to Invoker Servlet ");
		
			
	}

}
