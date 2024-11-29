class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double ratioA = (double) a.value / a.weight;
        double ratioB = (double) b.value / b.weight;
        return Double.compare(ratioB, ratioA);
    }
}