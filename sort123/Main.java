package sort123;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static Date[] createDateArray(String[] dateStrings) {
        SimpleDateFormat dateTimeInstance = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date[] dates = new Date[dateStrings.length];
        for (int i = 0; i < dateStrings.length; i++) {
            dates[i] = dateTimeInstance.parse(dateStrings[i], new ParsePosition(0));
        }
        return dates;
    }

    public static void main(String[] args) {
    	FileInfo[] files = new FileInfo[5];
    	
        files[0] = new FileInfo("CompareModifiedDate", "java", 120, dateTimeInstance.parse("2022-09-13T21:59:00"));
        files[1] = new FileInfo("CompareFileType", "java", 80, dateTimeInstance.parse("2022-09-12T21:59:00"));
        files[2] = new Fileinfo("CompareFileName", "class", 150, dateTimeInstance.parse("2022-09-13T16:54:00"));
        files[3] = new FileInfo("Main", "java", 85, dateTimeInstance.parse("2022-09-12T21:54:00"));
        files[4] = new FileInfo("CompareSize", "Class", 100, dateTimeInstance.parse("2022-09-13T11:59:00"));

        Sorter si = new Sorter();
        
        System.out.println("원본 리스트");
        for (FileInfo file : files) {
            System.out.println(file);
        }

        si.setComparable(new CompareFileName());
        si.bubbleSort(files);
        System.out.println("\n파일 이름으로 정렬된 리스트");
        for (FileInfo file : files) {
            System.out.println(file);
        }

        si.setComparable(new CompareFileType());
        si.bubbleSort(files);
        System.out.println("\n파일 종류로 정렬된 리스트");
        for (FileInfo file : files) {
            System.out.println(file);
        }

        si.setComparable(new CompareSize());
        si.bubbleSort(files);
        System.out.println("\n파일 크기로 정렬된 리스트");
        for (FileInfo file : files) {
            System.out.println(file);
        }

        si.setComparable(new CompareModifiedDate());
        si.bubbleSort(files);
        System.out.println("\n파일 수정 시간으로 정렬된 리스트");
        for (FileInfo file : files) {
            System.out.println(file);
        }
    }
}
