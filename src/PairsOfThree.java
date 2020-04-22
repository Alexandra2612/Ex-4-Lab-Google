public class PairsOfThree {
    public int findpairsofThree(int[] tab){
        int pairs=0;
        for(int i=0;i<tab.length;i++)
           for(int j=i+1;j<tab.length;j++)
               for(int k=j+1;k<tab.length;k++)
                   if(tab[i]+tab[j]+tab[k]==0&&tab[i]!=0&&tab[j]!=0&&tab[k]!=0){
                       pairs++;
                       tab[i]=0;
                       tab[j]=0;
                       tab[k]=0;
                   }
        return pairs;
    }
}
