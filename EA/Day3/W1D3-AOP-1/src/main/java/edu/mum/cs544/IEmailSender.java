package edu.mum.cs544;

public interface IEmailSender {
	public void sendEmail(String email, String message);
	public String getOutgoingMailServer();
}