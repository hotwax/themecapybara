<template>
  <themecapybara-components-block v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <carousel class="w-full" v-bind:autoplay="true"
    v-bind:navigationEnabled="true" v-bind:paginationEnabled="true"
    v-bind:autoplayHoverPause="true" v-bind:centerMode="true"
    v-bind:loop="true" v-bind:autoplayTimeout="5 * 1000"
    v-bind:perPage="1" v-else>
      <slide v-for="(item,i) in model.slides" :key="i">
        <div class="relative overflow-hidden" v-bind:style="`height: 70vh;`">
          <v-lazy-image class="w-full h-full object-center object-cover" v-if="item.image"
          v-bind:src="item.image" v-bind:alt="item.alt"></v-lazy-image>
          <h2 class="absolute top-0 p-4 text-black text-xl w-full"
          v-if="item.title" v-html="item.title" v-bind:class="{
            'text-left': item.aligntext === 'left',
            'text-right': item.aligntext === 'right',
            'self-start': item.aligntext === 'left',
            'self-end': item.aligntext === 'right'
        }" v-bind:style="{ 'color': item.textColor}"></h2>
          <figcaption class="absolute bottom-0 p-4 text-black text-xl w-full"
          v-if="item.subtitle" v-html="item.subtitle" v-bind:class="{
            'text-left': item.aligntext === 'left',
            'text-right': item.aligntext === 'right',
            'self-start': item.aligntext === 'left',
            'self-end': item.aligntext === 'right'
        }" v-bind:style="{ 'color': item.textColor}"></figcaption>
        </div>
      </slide>
    </carousel>
  </themecapybara-components-block>
</template>

<script>
  import { Carousel, Slide } from 'vue-carousel';

  export default {
    props: ['model'],
    computed: {
      name() {
          return this.model.path.split('/').slice(1).join('-').slice(4)
      },
      isEditAndEmpty() {
          if(!$peregrineApp.isAuthorMode()) return false
          //return (this.model.cards.length === 0)
          return this.$helper.areAllEmpty(this.model.slides)
      }
    },
    components: {
      Carousel,
      Slide
    },
  }
</script>
