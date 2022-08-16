let head = [1,2,3,4,5]

var reverseList = function (head) {
    let prev = null;

    while (head) {
        let next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }

    return prev;
};