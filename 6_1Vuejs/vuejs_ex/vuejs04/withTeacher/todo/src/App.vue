<template>
  <div class="todo">
    <div class="todo__title">
      <h1 class="todo__text">Todo List</h1>
      <ul class="todo__tab">
        <li class="todo__tab--active">전체</li>
        <li>완료</li>
      </ul>
    </div>
    <div class="todo__list">
      <!-- 할 일 목록이 있을 때 (완료 시 .todo__item--completed 클래스 추가 )-->
      <div class="todo__item">
        <input type="checkbox" id="chk" />
        <label for="chk" class="todo__checkbox-label"></label>
        <span class="todo__item-text">아침먹기</span>
        <span class="material-symbols-outlined todo__delete-icon">
          delete
        </span>
      </div>
      <!-- 할 일 목록이 없을 때 -->
      <div class="todo__item--no" style="display: none">
        <p>할일 목록이 없습니다.</p>
      </div>
    </div>
    <div class="todo__input">
      <input
        type="text"
        class="todo__input-text"
        placeholder="할 일을 입력하세요."
      />
      <button class="todo__input-btn">등록</button>
    </div>
  </div>
</template>
