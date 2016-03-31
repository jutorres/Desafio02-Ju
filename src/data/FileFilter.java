package data;

public class FileFilter {
		
		private String txt;
		private String csv;
		private String png;
		private String jpg;
		private String gif;
		private String css;
		private String js;
		private int quantity;
		
		public FileFilter(String txt, String csv, String png, String jpg, String gif, String css, String js, int quantity) {
			this.txt = txt;
			this.csv = csv;
			this.png = png;
			this.jpg = jpg;
			this.gif = gif;
			this.css = css;
			this.js = js;
			this.quantity = quantity;
		}

		public String getTxt() {
			return txt;
		}

		public String getCsv() {
			return csv;
		}

		public String getPng() {
			return png;
		}

		public String getJpg() {
			return jpg;
		}

		public String getGif() {
			return gif;
		}

		public String getCss() {
			return css;
		}

		public String getJs() {
			return js;
		}
		
		public int getQuantity() {
			return quantity;
		}

		@Override
		public String toString() {
			return "FileFilter: " + "\n" + 
							"txt= " + txt + "\n"
							+ "csv= " + csv + "\n"
							+ "png= " + png + "\n"
							+ "jpg= " + jpg + "\n"
							+ "gif= " + gif + "\n"
							+ "css= " + css + "\n"
							+ "js= " + js + "\n"
							+ "quantidade de banda= " + quantity + "\n";
		}
		
		
}
