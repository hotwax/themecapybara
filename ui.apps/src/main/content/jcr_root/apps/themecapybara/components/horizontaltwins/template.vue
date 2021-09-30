<template>
  <div style="width: 1240px; height: 472px; margin: 0 auto;" v-bind:data-per-path="model.path">
    <div class="horizontaltwins-left-banner" v-bind:style="{ 'background-image': 'url(' + model.cards[0].image + ')' }">
      <h4 class="horizontaltwins-banner-heading" v-html=" model.cards[0].title" v-bind:style="{ 'color': model.cards[0].textColor}"></h4>
      <p class="horizontaltwins-banner-text" v-html=" model.cards[0].text" v-bind:style="{ 'color': model.cards[0].textColor}"></p>
      <br>
      <a href="#" class="horizontaltwins-banner-button" v-if="model.cards[0].buttontext != '' " v-html="model.cards[0].buttontext"></a>
    </div>
    <div class="horizontaltwins-right-banner" v-bind:style="{ 'background-image': 'url(' +model.cards[1].image+ ')' }">
      <h4 class="horizontaltwins-banner-heading" v-html=" model.cards[1].title" v-bind:style="{ 'color': model.cards[1].textColor}"></h4>
      <p class="horizontaltwins-banner-text" v-html=" model.cards[1].text" v-bind:style="{ 'color': model.cards[1].textColor}"></p>
      <br>
      <a href="#" class="horizontaltwins-banner-button" v-if="model.cards[1].buttontext != ''" v-html="model.cards[1].buttontext"></a>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

<style>
  .horizontaltwins-left-banner{
    float: left; 
    width: 610px; 
    border: 1px solid #607d8b;; 
    height: 440px; 
    margin-top: 15px;
    margin-bottom: 20px;
    font-family: var(--font-sans); 
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
    overflow: hidden;
  }
  .horizontaltwins-right-banner{
    font-family: var(--font-sans);
    float: right; 
    width: 610px; 
    border: 1px solid #607d8b; 
    height: 440px; 
    margin-top: 15px;
    margin-bottom: 20px; 
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
    overflow: hidden;
  }
  .horizontaltwins-banner-heading{
    margin-top: 10%;
    font-style: normal;
    font-weight: normal;
    font-size: 48px;
    line-height: 77px;
    margin-left: 90px;
  }
  .horizontaltwins-banner-button{
    background-color: black;
    border: none;
    color: white;
    padding: 15px 70px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    margin-left: 90px;
    font-weight: bold;
  }
  .horizontaltwins-banner-text{
    font-style: normal;
    font-weight: normal;
    font-size: 18px;
    line-height: 29px;
    margin-left: 90px;
  }

</style>

