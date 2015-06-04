r = gets.to_i
l = gets.to_i

line = [r]

(l - 1).times do
  line = line.chunk { |i| i }.flat_map do |num, items|
    [items.size, num]
  end
end

puts line.join ' '