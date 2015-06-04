STDOUT.sync = true # DO NOT REMOVE

n, l, e = gets.split(" ").collect {|x| x.to_i}
links = l.times.map do
  n1, n2 = gets.split(" ").collect {|x| x.to_i}
  [n1, n2]
end
exits = e.times.map do
  gets.to_i # the index of a gateway node
end

to_sever = links.map do |n1, n2|
  if exits.include?(n1)
    [n2, n1]
  elsif exits.include?(n2)
    [n1, n2]
  else
    nil
  end
end.compact

loop do
  si = gets.to_i # The index of the node on which the Skynet agent is positioned this turn
  STDERR.puts si
  index = to_sever.find_index do |node, _|
    si == node
  end

  if index
    link = to_sever.delete_at index
  else
    link = to_sever.pop
  end
  puts "#{link[0]} #{link[1]}"
end