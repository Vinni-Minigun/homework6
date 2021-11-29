package ru.netology.stats;

public class StatsService {
    public int amountSales(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount = amount + sale;
        }

        return amount;
    }

    public int averageAmountMonth(int[] sales) {
        return amountSales(sales) / sales.length;


    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }

        return maxMonth + 1;

    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }

        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int average = averageAmountMonth(sales);
        int belowMonth = 0;
        for (int sale : sales) {
            if (sale < average) {
                belowMonth++;
            }
        }

        return belowMonth;
    }

    public int aboveAverageSales(int[] sales) {
        int average = averageAmountMonth(sales);
        int aboveMonth = 0;
        for (int sale : sales) {
            if (sale > average) {
                aboveMonth++;
            }
        }

        return aboveMonth;
    }

}
