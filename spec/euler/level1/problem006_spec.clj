(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"
  (it "can sum squares"
    (should= 55 (sum-squares-up-to 5) ))
  (it "can square sums"
    (should= 225 (square-sums-up-to 5)))
  (it "Solves #6"
    (should= 2640 (euler-6 10)))
  )

(run-specs)
