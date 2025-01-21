(ns euler.level1.problem004)

(defn palindrome? [n]
  (= (str n) (apply str (reverse (str n)))))

(defn multiply-all-with-limit [min max]
  (for [x1 (range min max)
        x2 (range min max)]
    (* x1 x2)))

(defn euler-4 []
  (apply max (filter (fn [x] (palindrome? x)) (multiply-all-with-limit 100 1000))))