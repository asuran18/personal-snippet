public class UnzipTest {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\test.zip");
			ZipFile zip = new ZipFile(file, Charset.forName("GBK")); 
			Enumeration<? extends ZipEntry> iter = zip.entries();
			while (iter.hasMoreElements()) {
				ZipEntry entry = iter.nextElement();
				System.out.println(entry.getName());
				InputStream input = zip.getInputStream(entry);
				File dest = new File(new File("E:\\"), entry.getName());
				FileOutputStream output = new FileOutputStream(dest); 
				int count;
        byte[] buf = new byte[8192];
        while ((count = input.read(buf)) != -1) {
          output.write(buf, 0, count);
        }
        input.close();
        output.close();
			}
			zip.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
