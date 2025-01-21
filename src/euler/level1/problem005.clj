(ns euler.level1.problem005)

(defn greatest-common-divisor [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn least-common-multiple [a b]
  (/ (* a b) (greatest-common-divisor a b)))

(defn euler-5 [end]
  (reduce least-common-multiple (range 1 (inc end))))

