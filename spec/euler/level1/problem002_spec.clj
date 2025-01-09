(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

          (it "Solves #2"
              (should= 4613732 (euler-2 4000000)))
          (it "fibonaccis"
              (should= [0 1 1 2 3 5 8] (fibonacci-up-to 9)))
          (it "filters sequence to even only"
              (should= [0 2 8] (fibonacci-even-up-to 9)))

          )

(run-specs)
