import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { FooterComponent } from './components/footer/footer.component';
import { MenuNavComponent } from './components/header/menu-nav/menu-nav.component';
import { MenuBarComponent } from './components/header/menu-bar/menu-bar.component';
import { SonyBarComponent } from './components/header/sony-bar/sony-bar.component';
import { HttpClientModule } from '@angular/common/http';
import { AngularSvgIconModule } from 'angular-svg-icon';
import { CardBannerComponent } from './components/cards/card-banner/card-banner.component';
import { CardGamesComponent } from './components/cards/card-games/card-games.component';
import { CardProductComponent } from './components/cards/card-product/card-product.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FooterComponent,
    MenuNavComponent,
    MenuBarComponent,
    SonyBarComponent,
    CardBannerComponent,
    CardGamesComponent,
    CardProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    AngularSvgIconModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
