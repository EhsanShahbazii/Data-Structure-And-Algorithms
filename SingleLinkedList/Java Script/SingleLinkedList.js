class Node {
  #m_value = null;
  #m_next = null;

  constructor(value, next) {
    this.#m_value = value;
    this.#m_next = next;
  }

  getValue() {
    return this.#m_value;
  }

  getNext() {
    return this.#m_next;
  }

  setValue(value) {
    this.#m_value = value;
  }

  setNext(next) {
    this.#m_next = next;
  }
}

class SingleLinkedList {
  #m_head;
  #m_tail;
  #m_size;

  constructor() {
    this.#m_head = null;
    this.#m_tail = null;
    this.#m_size = 0;
  }

  addFirst(value) {
    this.#m_head = new Node(value, this.#m_head);

    this.#m_tail = this.#m_size == 0 ? this.#m_head : this.#m_tail;

    this.#m_size++;
  }

  addLast(value) {
    this.#m_tail = new Node(value, null);

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

    this.#m_size--;

    return lastHead;
  }
}

function main() {
  let sll = new SingleLinkedList();

  sll.addFirst("Task 1");
  sll.addLast("Task 2");
  sll.addFirst("Task 3");
  //   sll.removeFirst();

  console.log(sll.first());
}

main();
