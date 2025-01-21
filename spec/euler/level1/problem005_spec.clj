(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"
  (it "can find greatest common divisor"
    (should= 5 (greatest-common-divisor 10 5)))
  (it "can find least common multiple"
    (should= 10 (least-common-multiple 10 5)))
  (it "euler-5 up to 10"
    (should= 2520 (euler-5 10)))
  (it "euler-5 up to 20"
    (should= 232792560 (euler-5 20)))

  )

(run-specs)
