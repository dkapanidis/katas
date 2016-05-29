describe("A minesweeper", function () {
  it("should return nothing if entry is a 0 0 map", function () {
    expect(minesweeper("0 0")).toBe("");
  });
  it("should return 0 if input is a map of [1 1] dimentions without mines", function() {
    expect(minesweeper("1 1\n.")).toBe("0");
  });
  it("should return * if input is a map of [1 1] dimensions with a mine", function() {
    expect(minesweeper("1 1\n*")).toBe("*");
  });
});
