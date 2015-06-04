n = gets.to_i
dict = n.times.map do
  gets.chomp
end
lettres = gets.chomp.chars.to_a

scores = [
  [%w[e a i o n r t l s u], 1],
  [%w[d g],                 2],
  [%w[b c m p],             3],
  [%w[f h v w y],           4],
  [%w[k],                   5],
  [%w[j  x],                8],
  [%w[q z],                10],
]

calc_score = lambda do |mot|
  letts = lettres.dup
  score = mot.chars.map do |l|
    return 0 unless letts.delete_at(letts.index(l) || letts.size)
    scores.find { |s| s[0].include? l }[1]
  end.reduce(:+)
  score
end

puts dict.max_by(&calc_score)