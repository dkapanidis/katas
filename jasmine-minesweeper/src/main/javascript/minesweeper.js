function minesweeper(input) {
  regex = /(\d) (\d)\n(.*)/;
  if (!regex.test(input)) {
    return "";
  }
  x = regex.exec(input)[1];
  y = regex.exec(input)[2];
  mine = regex.exec(input)[3];
  if (mine == ".") {
      return "0";
    } else {
      return "*";
    }
  return "";
}
