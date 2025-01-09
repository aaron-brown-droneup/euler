(ns euler.level1.problem004)




(defn is-palindrome [n]
  (= (str n) (apply str (reverse (str n))))
  )

(defn mult-all-with-lim [min max]
  (for [x1 (range min max)
        x2 (range min max)]
    (* x1 x2))
  )

(defn euler-4 []

  (apply max (filter (fn [x] (is-palindrome x)) (mult-all-with-lim 100 1000)))

  )