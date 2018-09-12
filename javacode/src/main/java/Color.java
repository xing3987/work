public enum Color {
    blue("蓝",1),yellow("黄",2),green("绿",3);

    private String color;
    private Integer index;

    Color(String color,int index) {
        this.color=color;
        this.index=index;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public static Color getColor(int index){
        for(Color c:Color.values()){
            if(c.getIndex()==index){
                System.out.println(c.color+c.index+c.name());
                return c;
            }
        }
        return null;
    }
}
