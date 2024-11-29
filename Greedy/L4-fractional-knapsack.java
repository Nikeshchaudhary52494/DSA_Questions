import java.util.*;

class Solution {
    class Item {
        int value, weight;
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    class ItemComparator implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            double ratioA = (double) a.value / a.weight;
            double ratioB = (double) b.value / b.weight;
            return Double.compare(ratioB, ratioA);
        }
    }

    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        int n = val.size();
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new Item(val.get(i), wt.get(i)));
        }
        Collections.sort(items, new ItemComparator());
        
        double maxValue = 0.0;
        int currentWeight = 0;
        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                currentWeight += item.weight;
                maxValue += item.value;
            } else {
                int remainingCapacity = capacity - currentWeight;
                maxValue += (double) item.value / item.weight * remainingCapacity;
                break;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        List<Integer> values = Arrays.asList(100, 60, 120);
        List<Integer> weights = Arrays.asList(20, 10, 30);
        int capacity = 50;
        
        double maxValue = sol.fractionalKnapsack(values, weights, capacity);
        System.out.println("The maximum value is " + maxValue);
    }
}
