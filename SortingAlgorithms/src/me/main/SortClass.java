package me.main;

public abstract class SortClass {
	long swaps = 0;
	long totalTimeTook = 0;
	long runs = 0;
	
	private long startTime = 0;
	protected String name = "";
	
	
	public abstract void Sort(int[] arr);
	
	public void Swap(int[] arr, int i1, int i2) {
		this.swaps += 1;
		int p1 = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = p1;
	}
	
	protected void StartTimer() {
		this.startTime = System.currentTimeMillis();
		this.runs += 1;
	}
	
	protected void EndTimer() {
		this.totalTimeTook += (System.currentTimeMillis() - this.startTime);
		
	}
	
	public void PrintInfo() {
		System.out.println(name + ": took " + totalTimeTook + "ms with " + (this.swaps) + " swaps on average!");
		System.out.println(runs);
	}
}
