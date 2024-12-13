(ns euler.level1.problem001)

(defn multiple-of-3-or-5 [n]
  (or (= 0 (rem n 3))
      (= 0 (rem n 5))))

(defn euler-1 [n]
  (->> (range n)
       (filter multiple-of-3-or-5)
       (apply +)))
