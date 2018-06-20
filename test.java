class test{
	public static void main( String[] args){
		WordStoreImp_v2 h_map = new WordStoreImp_v2(10);

		h_map.add("1");	
		h_map.add("2");
		h_map.add("3");	
		h_map.add("4");	h_map.add("5");	h_map.add("6");
		h_map.add("7");	h_map.add("8");	
		h_map.add("9");
		h_map.add("0");	h_map.add("0h");	

		System.out.println( h_map);
	}	
}