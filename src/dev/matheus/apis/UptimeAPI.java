package dev.matheus.apis;

public class UptimeAPI implements Runnable {

	public int day = 0;
	public int hour = 0;
	public int minute = 0;
	public int second = 0;
	private boolean Start = false;
	private Thread thread;

	public void run() {
		try {
			while (this.Start) {
				Thread.sleep(1000);
				this.second++;

				if (this.second > 59) {
					this.second = 00;
					this.minute++;
				}

				if (this.minute == 59) {
					this.minute = 00;
					this.hour++;
				}
				if (this.hour >= 24) {
					this.hour = 00;
					this.day++;
				}
				if (!this.Start) {
					break;
				}
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public void startCount() {
		if (this.Start) {
			return;
		}
		this.Start = true;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@SuppressWarnings("deprecation")
	public void stopCount() {
		if (!this.Start) {
			return;
		}
		this.Start = false;
		this.thread.stop();
		this.thread = null;
	}
	
	/*
	 * Uptime uptime = new Uptime();
uptime.startCount(); //Inicia contador.
String dias = uptime.day; //Informa quantos dias o programa está ligado.
String horas = uptime.hour; //Informa quantas horas o programa está ligado.
String minutos = uptime.minute; //Informa quantos minutos o programa está ligado.
String segundos = uptime.second; //Informa quantos segundos o programa está ligado.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
