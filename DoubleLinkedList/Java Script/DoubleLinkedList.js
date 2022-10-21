class Node {
  #m_value = null;
  #m_next = null;
  #m_prev = null;

  constructor(value, prev, next) {
    this.#m_value = value;
    this.#m_prev = prev;
    this.#m_next = next;
  }

  getValue() {
    return this.#m_value;
  }

  getNext() {
    return this.#m_next;
  }

  getPrev() {
    return this.#m_prev;
  }

  setValue(value) {
    this.#m_value = value;
  }

  setNext(next) {
    this.#m_next = next;
  }

  setPrev(prev) {
    this.#m_prev = prev;
  }
}

class DoubleLinkedList {
  #m_head;
  #m_tail;
  #m_size;

  constructor() {
    this.#m_head = null;
    this.#m_tail = null;
    this.#m_size = 0;
  }

  addFirst(value) {
    this.#m_head = new Node(value, null, this.#m_head);

    this.#m_tail = this.#m_size == 0 ? this.#m_head : this.#m_tail;

    this.#m_size++;
  }

  addLast(value) {
    this.#m_tail = new Node(value, this.#m_tail, null);

    this.#m_tail = this.#m_size == 0 ? this.#m_head : this.#m_tail;

    this.#m_size++;
  }

  isEmpty() {
    return this.#m_size === 0;
  }

  size() {
    return this.#m_size;
  }

  first() {
    return this.#m_head;
  }

  last() {
    return this.#m_tail;
  }

  removeFirst() {
    if (this.#m_size === 0) return null;

    let lastHead = this.#m_head.getValue();
    this.#m_head = this.#m_head.getNext();
    this.#m_head.setPrev(null);

    this.#m_size--;

    return lastHead;
  }

  removeLast() {
    if (this.#m_size === 0) return null;

    let lastTail = this.#m_tail.getValue();
    this.#m_tail = this.#m_tail.getNext();
    this.#m_tail.setNext(null);

    this.#m_size--;

    return lastTail;
  }
}

function main() {
  let sll = new DoubleLinkedList();

  sll.addFirst("Task 1");
  sll.addLast("Task 2");
  sll.addFirst("Task 3");
  //   sll.removeFirst();

  console.log(sll.last());
}

main();
