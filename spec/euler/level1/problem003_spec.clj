(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (it "Solves #3"
    (should= 6857 (euler-3 600851475143)))
  (it "can check if prime"
    (should= true (prime? 7)))
  (it "can check if not prime"
    (should= false (prime? 10)))
  (it "can get next prime"
    (should= 5 (get-next-prime 3)))
  (it "can get prime factors"
    (should= '(2 5 5) (get-prime-factors 50 2)))

  )

(run-specs)
