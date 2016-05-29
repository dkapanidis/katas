(defn calculate [input] ; calculates the sum of the input numbers
    (str 
       (if (> (.length input)  0) (Integer/valueOf input) 0)
    )
)


(defn tdd [expected actual]
  (print expected)
  (print " - ")
  (println actual)
  (str)
)

(tdd 0 (calculate ""))
(tdd 32 (calculate "32"))
