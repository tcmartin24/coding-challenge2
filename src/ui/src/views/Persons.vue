<template>
  <div class="-m--10">
    <div class="a-card -s--5" style="max-width: 50%">
      <div class="a-card__content">
        <div class="a-card__title">Add Person</div>
        <div>
          <div class="a-grid -mb--2">
            <div class="a-col -w--2">
              <label class="a-label -mr--2" for="fname" style="white-space: nowrap">First Name:</label>
            </div>
            <div class="a-col -w--6">
              <input class="a-input" type="text" id="fname" placeholder="First Name">
            </div>
          </div>
          <div class="a-grid -mb--2">
            <div class="a-col -w--2">
              <label class="a-label -mr--2" for="lname" style="white-space: nowrap">Last Name:</label>
            </div>
            <div class="a-col -w--6">
              <input class="a-input" type="text" id="lname" placeholder="Last Name">
            </div>
          </div>
          <div class="a-grid -mb--2">
            <div class="a-col -w--2">
              <label class="a-label -mr--3" for="age" style="white-space: nowrap">Age:</label>
            </div>
            <div class="a-col -w--6">
              <input class="a-input" type="number" id="age" placeholder="age">
            </div>
          </div>
        </div>
      </div>
      <div class="a-card__footer">
        <button class="a-btn -primary">Submit</button>
        <button class="a-btn -ml--2">Clear</button>
      </div>
    </div>
    <table class="a-table -mt--10">
      <thead>
        <tr>
          <th class="-text--left">ID</th>
          <th class="-text--center">Name</th>
          <th class="-text--right">Age</th>
        </tr>
      </thead>
      <tbody>
        <tr class="-md" v-if="loading">
          <td colspan="3">
            <svg class="a-spinner -sm--3" viewBox="0 0 66 66">
              <title>Loading</title>
              <circle class="path" cx="33" cy="33" r="30" fill="none" stroke-width="6"></circle>
            </svg>
          </td>
        </tr>
        <tr class="-md">
          <td class="-text--left">12221</td>
          <td class="-text--center">John, Wick</td>
          <td class="-text--right">45</td>
        </tr>
        <tr class="-md">
          <td class="-text--left">007</td>
          <td class="-text--center">James, Bond</td>
          <td class="-text--right">55</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'Persons',
  data() {
    return {
      firstName: '',
      lastName: '',
      age: '',
      loading: false,
      persons: [],
    };
  },
  mounted() {
    this.getPersons();
  },
  methods: {
    getPersons() {
      this.loading = true;
      axios.get('http://localhost:9001/people');
    },
    submit() {
      const person = {
        age: this.age,
        firstName: this.firstName,
        lastName: this.lastName,
      };
      axios.post('http://localhost:9001/people', person).;
    },
    clear() {
      this.firstName = '';
      this.lastName = '';
      this.age = '';
    },
  },
};
</script>
