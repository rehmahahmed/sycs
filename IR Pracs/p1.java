public int editDistanceRecursion(String s1, String s2, int m, int n){
        if(m==0) return n;
        if(n==0) return m;
        if(s1.charAt(m-1)==s2.charAt(n-1))
            return editDistanceRecursion(s1, s2, m-1, n-1);
        return 1 + Math.min(editDistanceRecursion(s1, s2, m, n-1),
                Math.min(editDistanceRecursion(s1,s2,m-1,n),
                        editDistanceRecursion(s1, s2, m-1, n-1)
                        ));
    }
    public static void main(String[] args) {
        String s1 = "saturday";
        String s2 = "sunday";
        prac1 ed = new prac1();
        System.out.println("Minimum Edit Distance: " + 
                ed.editDistanceRecursion(s1, s2, s1.length(), s2.length()));
    } 
