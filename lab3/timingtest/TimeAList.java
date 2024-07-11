package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {

    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();
        int testlength = 1000;
        for (int p=0; p<10; p++) {
            Ns.addLast(testlength);
            AList<Integer> testlist = new AList<>();
            Stopwatch sw = new Stopwatch();
            for (int i=0; i<testlength; i++) {
                testlist.addLast(1);
            }
            double timeinseconds = sw.elapsedTime();
            times.addLast(timeinseconds);
            opCounts.addLast(testlength);
            testlength *=2;
        }
        printTimingTable(Ns, times, opCounts);
    }
}
