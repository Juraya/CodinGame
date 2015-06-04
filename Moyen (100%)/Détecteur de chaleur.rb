STDOUT.sync = true # DO NOT REMOVE

w, h = gets.split(" ").collect {|x| x.to_i}
n = gets.to_i # maximum number of turns before game over.
x, y = gets.split(" ").collect {|x| x.to_i}
xmin = 0
xmax = w
ymin = 0
ymax = h

loop do
    bomb_dir = gets.chomp
    
    if bomb_dir.include?("L")
        xmax = x
    end
    if bomb_dir.include?("R")
        xmin = x+1
    end
    if bomb_dir.include?("U")
        ymax = y
    end
    if bomb_dir.include?("D")
        ymin = y + 1
    end
    
    x = (xmin+xmax)/2
    y = (ymin+ymax)/2
    
    puts "#{x} #{y}"
end