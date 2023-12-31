public class CustomArrayList {
    private int[] customArrayList;
    private int size;
    private int nmbrEl=0;
    public CustomArrayList(){
        customArrayList=new int[10];
        size=10;
    }
    public CustomArrayList(int initialSize)
    {
        customArrayList=new int[initialSize];
        size=initialSize;
    }
    public void add(int obj){
        if (nmbrEl>size-1)
        {
            int[] newArray=new int[size*2];
            System.arraycopy(customArrayList, 0, newArray, 0, customArrayList.length);
            customArrayList=newArray;
            size=size*2;
            newArray[nmbrEl]=obj;
            nmbrEl++;

        }
        else
        {
            customArrayList[nmbrEl]=obj;
            nmbrEl++;
        }


    }
    public void add(int index,int x){
        if (index < 0 || index > nmbrEl) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + nmbrEl);
        }
        if (index==nmbrEl-1)
        {
            add(x);
        }
        else{
            System.arraycopy(customArrayList, index, customArrayList, index + 1, nmbrEl - index);
            customArrayList[index] = x;
        }
    }
    public void affiche(){
        for ( int i=0; i<size;i++)
        {
            System.out.println(customArrayList[i]);
        }
    }
    public int get(int index)
    {
        return customArrayList[index-1];
    }
    public int size()
    {
        return nmbrEl;
    }
    public boolean isEmpty(){
        if (nmbrEl==0)
            return true;
        else
            return false;
    }
    public boolean isIn (int x){
        for ( int i=0; i<size;i++)
            if(customArrayList[i]==x)
                return true;
        return false;
    }
    public int find (int x){
        for ( int i=0; i<size;i++)
            if(customArrayList[i]==x)
                return i;
        return -1;
    }
    public void remove(int x) {
        int i = 0;
        while (i < nmbrEl && customArrayList[i] != x) {
            i++;
        }

        if (i < nmbrEl) {
            System.arraycopy(customArrayList, i + 1, customArrayList, i, nmbrEl - i - 1);
            nmbrEl--;
        }
    }

    public static void main (String[] args)
    {
        CustomArrayList c = new CustomArrayList();
        for ( int i=0; i<15;i++)
        {
            c.add(i*3);
        }
        c.add(7,20);
        c.affiche();
        c.remove(20);
        c.affiche();
        System.out.println(c.get(4));
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        System.out.println(c.isIn(3));
        System.out.println(c.find(3));




    }
}
