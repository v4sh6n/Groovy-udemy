// Section 5 - 44
Range r = (1..10)
println r 
println r.class.name
println r.from
println r.to

assert (0..10).contains(0)
assert (0..10).contains(0)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false
assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7 
println today 
println oneWeekAway







