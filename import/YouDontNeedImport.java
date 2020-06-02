
class YouDontNeedImport {                                                 
    public static void main(String args[]) {
        java.util.ArrayList<String> celebs = new java.util.ArrayList<String>();
        celebs.add("Kim Kardashian");
        celebs.add("Justin Bieber");
        celebs.add("Taylor Swift");
        print(celebs);
    }

    static void print(java.util.ArrayList<String> list) {
        for (int i=0; i<list.size(); i++) {
            System.out.println("People love " + list.get(i));
        }
    }
}
