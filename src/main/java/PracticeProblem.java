public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static void selectionSortName(String[] names, int[] ages) {
		for (int i = 0;i<names.length-1;i++) {
			int smallestIndex = i;
			for (int j = i+1;j<names.length;j++) {
				if ((names[smallestIndex].toLowerCase()).compareTo(names[j].toLowerCase()) > 0) {
					smallestIndex = j;
				}
			}
			String temp = names[smallestIndex];
			names[smallestIndex]=names[i];
			names[i] = temp;
			int temporary = ages[smallestIndex];
			ages[smallestIndex]=ages[i];
			ages[i] = temporary;
		}
	}
	public static void selectionSortAge(String[] names, int[] ages) {
		for (int i = 0;i<names.length-1;i++) {
			int smallestIndex = i;
			for (int j = i+1;j<names.length;j++) {
				if (ages[smallestIndex]>ages[j]) {
					smallestIndex = j;
				}
			}
			String temp = names[smallestIndex];
			names[smallestIndex]=names[i];
			names[i] = temp;
			int temporary = ages[smallestIndex];
			ages[smallestIndex]=ages[i];
			ages[i] = temporary;
		}
	}

	

}
