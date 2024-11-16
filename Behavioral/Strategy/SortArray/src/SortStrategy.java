public class SortStrategy {
    private Sort sortTechnique;

    public void setSortTechnique(Sort sortTechnique){
        this.sortTechnique = sortTechnique;
    }

    public int[] sort(int nums[]){
       return sortTechnique.sort(nums);
    }
}
