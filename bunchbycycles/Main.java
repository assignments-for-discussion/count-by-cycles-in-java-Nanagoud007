package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    for(int i=0;i<cycles.length;i++){
      if(cycles[i]<150)
        counts.lowCount++;
      else if(cycles[i]<650)
         counts.mediumCount++;
      else
         counts.highCount++;
    }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts1 = countBatteriesByUsage(new int[] {150, 149, 650, 649, 900, 1000});
    assert(counts1.lowCount == 1);
    assert(counts1.mediumCount == 2);
    assert(counts1.highCount == 3);
    CountsByUsage counts2 = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts2.lowCount == 1);
    assert(counts2.mediumCount == 3);
    assert(counts2.highCount == 2);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
