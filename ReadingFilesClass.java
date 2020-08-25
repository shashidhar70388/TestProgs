package TestPrograms;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ReadingFilesClass {
	
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		ReadingFilesClass reading=new ReadingFilesClass();
		reading.readFiles();
	}
	
	
	public  void readFiles() {
		File file=new File("D://ProjectLogics//Logics//src");
		
		File[] files=file.listFiles();
		
		for(int i=0;i<files.length;i++) {
			BasicFileAttributes atr;
			try {
				atr=Files.readAttributes(files[i].toPath(), BasicFileAttributes.class);
				FileTime time = atr.creationTime();
				String pattern = "MMMM";
			    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			    String formatted = simpleDateFormat.format(new Date(time.toMillis()));
			    if(map.containsKey(formatted))
			    	map.put(formatted, (map.get(formatted))+1);
			    else
			    	map.put(formatted, 1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		//printing month numbers along with count of files in that month
		System.out.println(map);
		
	}
	
}
