package com.mycompany.rehmahir;
import java.util.*;
import java.io.*;
import java.util.Scanner;

    public int path[][] = new int[10][10];
    public double pagerank[] = new double[10];

    public void calc(double totalNodes) {
        double initialPageRank;
        double outGoingLinks = 0;
        double dampingFactor = 0.85;
        double tempPageRank[] = new double[10];
        int externalNodeNumber;
        int internalNodeNumber;
        int k = 1;
        int ITERATION_STEP = 1;

        initialPageRank = 1 / totalNodes;
        System.out.printf("Total number of nodes: " + totalNodes + "\t Initial all nodes: " + initialPageRank + "\n");
        for (k = 1; k <= totalNodes; k++) {
            this.pagerank[k] = initialPageRank;
        }
        System.out.printf("\nInitial PageRank Values, 0th Stem \n");
        for (k = 1; k <= totalNodes; k++) {
            System.out.printf("Page Rank of " + k + " is :\t" + this.pagerank[k] + "\n");
        }
        while (ITERATION_STEP <= 2) {
            for (k = 1; k <= totalNodes; k++) {
                tempPageRank[k] = this.pagerank[k];
                this.pagerank[k] = 0;
            }
            for (internalNodeNumber = 1; internalNodeNumber <= totalNodes; internalNodeNumber++) {
                for (externalNodeNumber = 1; externalNodeNumber <= totalNodes; externalNodeNumber++) {
                    if (this.path[externalNodeNumber][internalNodeNumber] == 1) {
                        k = 1;
                        outGoingLinks = 0;
                        while (k <= totalNodes) {
                            if (this.path[externalNodeNumber][k] == 1) {
                                outGoingLinks = outGoingLinks + 1;
                            }
                            k = k + 1;
                        }
                        this.pagerank[internalNodeNumber] += tempPageRank[externalNodeNumber] * (1 / outGoingLinks);
                    }
                }
            }
            System.out.printf("\nAfter " + ITERATION_STEP + "th Step\n");
            for (k = 1; k <= totalNodes; k++) {
                System.out.printf("Page Rank of " + k + "is :\t" + this.pagerank[k] + "\n");
                ITERATION_STEP = ITERATION_STEP + 1;
            }
            for (k = 1; k <= totalNodes; k++) {
                this.pagerank[k] = (1 - dampingFactor) + dampingFactor * this.pagerank[k];
            }
            System.out.printf("\n Final Page Rank : \n");
            for (k = 1; k <= totalNodes; k++) {
                System.out.printf(" Page Rank of " + k + " is :\t" + this.pagerank[k] + "\n");
            }
        }
    }
    public static void main(String args[]) {
        int nodes, i, j, cost;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of WebPages \n");
        nodes = in.nextInt();
        Prac2 p = new Prac2();
        System.out.println(
        "Enter the Adjacency Matrix with 1->PATH & 0->NOPATH Between two WebPages: \n");
        for (i = 1; i <= nodes; i++) {
            for (j = 1; j <= nodes; j++) {
                p.path[i][j] = in.nextInt();
                if (j == i) {
                    p.path[i][j] = 0;
                }
            }
        }
        p.calc(nodes);
    }
